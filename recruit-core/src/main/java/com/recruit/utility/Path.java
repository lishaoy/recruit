package com.recruit.utility;

/**
 * Created by 58 on 2015/12/17.
 */
public class Path {
    public Path() {
    }

    /**
     * May 13 2016
     *
     * @return
     */
    public static String getWorkSpacePath() {
        return System.getProperty("user.dir");
    }

    /**
     * Jun 11 2016
     *
     * @return
     */
    public static String getConfigPath() {
        //todo  发布与开发不一致  May 19 2016
        //尝试解决 单元测试问题
        String pathTemp = Path.getWorkSpacePath();
//        String path = pathTemp.substring(0, pathTemp.lastIndexOf((File.separator)) + 1);

        //发布！！
        String path = Path.getWorkSpacePath();
        return path;
    }

    /**
     * 暂时不用！
     *
     * @return
     */
//    public static String getCurrentPath() {
//        String path = System.getProperty("serviceframe.config.path");
//        System.out.println("serviceframe.config.path:" + path);
//        if (path == null || path.equalsIgnoreCase("")) {
//            Class caller = getCaller();
//            if (caller == null) {
//                caller = Path.class;
//            }
//
//            path = getCurrentPath(caller);
//        }
//
//        System.out.println("utility path getCurrentPath:" + path);
//        return path;
//    }
    public static Class<?> getCaller() {
        StackTraceElement[] stack = (new Throwable()).getStackTrace();
        System.out.println("stack length:" + stack.length);
        if (stack.length < 3) {
            return Path.class;
        } else {
            String className = stack[2].getClassName();
            System.out.println("getCaller class name:" + className);

            try {
                return Class.forName(className);
            } catch (ClassNotFoundException var3) {
                var3.printStackTrace();
                return null;
            }
        }
    }
}
