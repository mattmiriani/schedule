package com.example.scheduler.domain.converter;

import com.example.scheduler.domain.dto.SubjectDTO;
import com.example.scheduler.domain.entity.Subject;

public class SubjectConverter {

    public static Subject from(SubjectDTO subjectDTO) {
        Subject subject = new Subject();

        subject.setId(subjectDTO.getId());
        subject.setName(subjectDTO.getName());
        subject.setCpfCnpj(subjectDTO.getCpfCnpj());

        return subject;
    }

    public static SubjectDTO to(Subject subject) {
        SubjectDTO subjectDTO = new SubjectDTO();

        subjectDTO.setId(subject.getId());
        subjectDTO.setName(subject.getName());
        subjectDTO.setCpfCnpj(subject.getCpfCnpj());

        return subjectDTO;
    }
}
