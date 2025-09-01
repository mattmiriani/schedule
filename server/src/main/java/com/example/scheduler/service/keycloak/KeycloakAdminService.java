package com.example.scheduler.service.keycloak;

import com.example.scheduler.domain.entity.AppUser;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.resource.UserResource;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class KeycloakAdminService {

    private @Value("${keycloak.realm}") String realm;
    private @Value("${keycloak.auth-server-url}") String authServerUrl;
    private @Value("${keycloak.resource}") String clientId;
    private @Value("${keycloak.credentials.secret}") String clientSecret;

    private final Keycloak keycloak;

    public KeycloakAdminService() {
        this.keycloak = Keycloak.getInstance(
            authServerUrl, realm,
            clientId, clientSecret
        );
    }

    public void updateUser(AppUser user) {
        UserResource userResource = keycloak.realm(realm).users().get(user.getId().toString());
        UserRepresentation userKeycloak = userResource.toRepresentation();

        userKeycloak.setFirstName(user.getName());
        userKeycloak.setLastName(
                Objects.nonNull(user.getLastName()) ?
                        user.getLastName() :
                        ""
        );

        userResource.update(userKeycloak);
    }
}