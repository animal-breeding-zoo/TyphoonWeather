package date.pm25.utils;

import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.ext.web.WebRenderExt;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by toy on 26/04/2017.
 */
public class GlobalExt implements WebRenderExt{
    @Override
    public void modify(Template template, GroupTemplate groupTemplate, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        template.binding("version", "1.0");
    }
}
