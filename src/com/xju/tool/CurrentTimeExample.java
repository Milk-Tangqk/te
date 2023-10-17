package com.xju.tool;

import java.util.Date;
import java.text.SimpleDateFormat;

public class CurrentTimeExample {
    public String getData() {
        // 获取当前时间
        Date currentDate = new Date();

        // 创建日期格式化对象
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 格式化日期并将其以字符串形式打印出来
        String formattedDate = dateFormat.format(currentDate);
        return formattedDate;
    }
}