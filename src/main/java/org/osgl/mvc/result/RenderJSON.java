package org.osgl.mvc.result;

import com.alibaba.fastjson.JSON;
import org.osgl.http.H;
import org.osgl.util.S;

public class RenderJSON extends RenderContent {
    public RenderJSON(String jsonStr) {
        super(jsonStr, H.Format.json);
    }
    public RenderJSON(String jsonFormat, Object ... args) {
        super(S.fmt(jsonFormat, args), H.Format.json);
    }
    public RenderJSON(Object v) {
        this(JSON.toJSONString(v));
    }
}