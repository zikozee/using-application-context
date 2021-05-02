package com.example.applicationcontext.permissions;


import java.util.Set;

/**
 * @author Ezekiel Eromosei
 * @since 10-01-2021
 */
public interface PermissionProvider {
  Set<CreatePermissionDTO> provide();
}
