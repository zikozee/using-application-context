package com.example.applicationcontext.permissions.bean1;

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
public class Bean1EnumImpl implements PermissionProvider {

    @Override
    public Set<CreatePermissionDTO> provide() {
        return getPermissions();
    }

    private Set<CreatePermissionDTO> getPermissions() {
        Set<CreatePermissionDTO> createPermission = new HashSet<>();
        for (Bean1Enum permissionEnum : Bean1Enum.values()) {
            CreatePermissionDTO createPermissionDTO = CreatePermissionDTO.builder()
                    .name(permissionEnum.getName())
                    .systemName(permissionEnum.getSystemName())
                    .build();
            createPermission.add(createPermissionDTO);
        }

        return createPermission;
    }
}
