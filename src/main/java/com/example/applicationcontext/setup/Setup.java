package com.example.applicationcontext.setup;

import com.example.applicationcontext.permissions.CreatePermissionDTO;
import com.example.applicationcontext.permissions.PermissionProvider;
import com.example.applicationcontext.permissions.bean1.Bean1EnumImpl;
import com.example.applicationcontext.permissions.bean2.Bean2EnumImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * @author : zikoz
 * @created : 02 May, 2021
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class Setup implements CommandLineRunner {

    private final Context context;
    private final List<PermissionProvider> permissionProviders;

    @Override
    public void run(String... args) throws Exception {

        log.info("Bean1 Permissions.............");
        PermissionProvider permissionProvider = context.getApplicationContext().getBean(Bean1EnumImpl.class);
        Set<CreatePermissionDTO> provide = permissionProvider.provide();
        provide.forEach(createPermissionDTO -> log.info("Bean1 PERMISSIONS {}", createPermissionDTO.toString() ));

        System.out.println("******************************************");

        log.info("Bean2  Permissions.............");
        PermissionProvider permissionProvider2 = context.getApplicationContext().getBean(Bean2EnumImpl.class);
        Set<CreatePermissionDTO> provide2 = permissionProvider2.provide();
        provide2.forEach(createPermissionDTO -> log.info("Bean1 PERMISSIONS {}", createPermissionDTO.toString() ));

        System.out.println("******************************************");

        log.info("All Permissions  Permissions.............");
        permissionProviders.forEach(permissionProvider1 ->
                permissionProvider1.provide().forEach(createPermissionDTO -> log.info("PermissionProvider Bean {}", createPermissionDTO.toString() )));
        System.out.println("******************************************");

    }
}
