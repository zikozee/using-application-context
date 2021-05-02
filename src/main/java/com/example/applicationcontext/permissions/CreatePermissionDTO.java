package com.example.applicationcontext.permissions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @author : zikoz
 * @created : 02 May, 2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreatePermissionDTO implements Serializable {
    private static final long serialVersionUID = -98765L;

    private String name;
    private String systemName;
}
