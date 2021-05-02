package com.example.applicationcontext.permissions.bean1;

import com.example.applicationcontext.permissions.PermissionSource;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : zikoz
 * @created : 02 May, 2021
 */
@Getter
@AllArgsConstructor
public enum Bean1Enum implements PermissionSource {
    VIEW_INDIVIDUAL("VIEW",  Authority.VIEW_INDIVIDUAL),
    APPROVE_INDIVIDUAL("APPROVE",  Authority.APPROVE_INDIVIDUAL),
    REJECT_INDIVIDUAL("REJECT",  Authority.REJECT_INDIVIDUAL);

    private final String name;
    private final String systemName;


    public static class Authority{
        private Authority(){}

        public static final String VIEW_INDIVIDUAL = "VIEW_INDIVIDUAL";
        public static final String APPROVE_INDIVIDUAL = "APPROVE_INDIVIDUAL";
        public static final String REJECT_INDIVIDUAL = "REJECT_INDIVIDUAL";
    }
}
