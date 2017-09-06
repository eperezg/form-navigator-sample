package com.liferay.gs.userformnav.information;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.servlet.taglib.ui.BaseJSPFormNavigatorEntry;
import com.liferay.portal.kernel.servlet.taglib.ui.FormNavigatorConstants;
import com.liferay.portal.kernel.servlet.taglib.ui.FormNavigatorEntry;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.ServletContext;
import java.util.Locale;

/**
 * Created by eduardo on 6/09/17.
 */
@Component(
        property = {"form.navigator.entry.order:Integer=75"},
        service = FormNavigatorEntry.class
)
public class NewPasswordSection extends BaseJSPFormNavigatorEntry<User>
        implements FormNavigatorEntry<User> {

    @Override
    protected String getJspPath() {
        return "/information/my_password.jsp";
    }

    @Override
    public String getCategoryKey() {
        return FormNavigatorConstants.CATEGORY_KEY_USER_USER_INFORMATION;
    }

    @Override
    public String getFormNavigatorId() {
        return FormNavigatorConstants.FORM_NAVIGATOR_ID_USERS;
    }

    @Override
    public String getKey() {
        return "password";
    }

    @Override
    public String getLabel(Locale locale) {
        return "password";
    }

    @Override
    @Reference(
            target = "(osgi.web.symbolicname=com.liferay.gs.userformnav)",
            unbind = "-"
    )
    public void setServletContext(ServletContext servletContext) {
        super.setServletContext(servletContext);
    }

}