package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class PermissionManagerTest {
    @Test
    void testGetSetMCurrentLevelName() {
        PermissionManager permissionManager = new PermissionManager();
        permissionManager.setmCurrentLevelName(PermissionLevel.ADMIN);
        assertEquals("ADMIN", permissionManager.getmCurrentLevelName());
    }
}
