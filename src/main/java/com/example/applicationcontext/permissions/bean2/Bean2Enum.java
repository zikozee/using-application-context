package com.example.applicationcontext.permissions.bean2;

import com.example.applicationcontext.permissions.PermissionSource;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author : zikoz
 * @created : 02 May, 2021
 */
@RequiredArgsConstructor
@Getter
public enum Bean2Enum implements PermissionSource {

    CREATE_USER("CREATE",  Authority.CREATE_USER),
    UPDATE_USER("UPDATE",  Authority.UPDATE_USER),
    VIEW_USER("VIEW",  Authority.VIEW_USER),
    DELETE_USER("DELETE",  Authority.DELETE_USER);

    private final String name;
    private final String systemName;


    public static class Authority{
        private Authority(){}

        public static final String CREATE_USER = "CREATE_USER";
        public static final String VIEW_USER = "VIEW_USER";
        public static final String UPDATE_USER = "UPDATE_USER";
        public static final String DELETE_USER = "DELETE_USER";
    }

}
