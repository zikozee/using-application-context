package com.example.applicationcontext.permissions.bean2;

import com.example.applicationcontext.permissions.CreatePermissionDTO;
import com.example.applicationcontext.permissions.PermissionProvider;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : zikoz
 * @created : 02 May, 2021
 */
@Service
public class Bean2EnumImpl implements PermissionProvider {

    @Override
    public Set<CreatePermissionDTO> provide() {
        return getPermissions();
    }

    private Set<CreatePermissionDTO> getPermissions() {
        Set<CreatePermissionDTO> createPermission = new HashSet<>();
        for (Bean2Enum permissionEnum : Bean2Enum.values()) {
            CreatePermissionDTO createPermissionDTO = CreatePermissionDTO.builder()
                    .name(permissionEnum.getName())
                    .systemName(permissionEnum.getSystemName())
                    .build();
            createPermission.add(createPermissionDTO);
        }

        return createPermission;
    }
}
