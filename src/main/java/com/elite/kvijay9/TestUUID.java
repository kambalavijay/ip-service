package com.elite.kvijay9;



import com.mysql.cj.util.StringUtils;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestUUID {
    public static void main(String[] args) throws SQLException {
        List l = List.of("", "ssoidentifier");
        String msg = "msg {1}";
        System.out.println(MessageFormat.format(msg, l.toArray()));
/*
        //msgRenderer(msg, new String[]{"ippid"});

        List attrs = List.of(1, 2, 3);

        System.out.println(msgRenderer(msg, attrs.toArray()));*/

    }

    public static String msgRenderer(String msg, Object[] args) {
        String renderedMsg = msg;
        try {
            renderedMsg =  MessageFormat.format(msg, args);
        } catch (IllegalArgumentException iae) {
        }
        return renderedMsg;
    }
}