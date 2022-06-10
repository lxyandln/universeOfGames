package com.universe.sjl.util;

import java.util.List;

public class ToolboxUtil {
    public static boolean isEmpty(String object) {
        if (object == null || object.trim().isEmpty() || "".equals(object)) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(List object) {
        if (object == null || object.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(Object object) {
        if (object == null || object.toString().trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
