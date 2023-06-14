package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ALMSController {

	public ALMSController() {

	}

	@RequestMapping(value = "/getattend")
	public String getAttend(Model model) {
		return "attend";
	}

	@RequestMapping(value = "/getallempattend")
	public String getAllEmpAttend(Model model) {
		return "adattend";
	}

	@RequestMapping(value = "/leaveapply")
	public String getLeave(Model model) {
		return "leaveform";
	}

	@RequestMapping(value = "/leaveupdate")
	public String handleLogin2() {
		return "leaveupd";
	}

	@RequestMapping(value = "/leavedelete")
	public String handleLogin3() {
		return "leavedel";
	}

	@RequestMapping(value = "/leaves")
	public String getLeaves(Model model) {

		return "viewleave";
	}

	@RequestMapping(value = "/permissionapply")
	public String getPermission(Model model) {

		return "permissionform";
	}

	@RequestMapping(value = "/permissions")
	public String viewPermission(Model model) {

		return "viewpermissions";
	}

	@RequestMapping(value = "/adshowleaves")
	public String adviewleave(Model model) {

		return "adshowleaves";
	}

	@RequestMapping(value = "/adshowpermission")
	public String adviewpermission(Model model) {

		return "adshowpermission";
	}

	@RequestMapping(value = "/adapproval")
	public String adApproval(Model model) {

		return "adapproval";
	}

	@RequestMapping(value = "/empapproval")
	public String empApproval(Model model) {

		return "empapproval";
	}

}
