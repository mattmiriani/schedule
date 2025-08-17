import { AuthConfig } from 'angular-oauth2-oidc';

export const authConfig: AuthConfig = {
  issuer: 'http://localhost:8443/realms/oauth2-demos',
  clientId: 'oauth2-pkce-demo',
  redirectUri: window.location.origin,
  responseType: 'code',
  scope: 'openid profile email offline_access',
  showDebugInformation: true,
  disablePKCE: false,
};
