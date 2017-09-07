package dxc.com.group.service;

import java.util.List;

import dxc.com.group.model.DefectDate;

public interface DefectDateService {
	List<DefectDate> getDefectDateByNameProject(String nameProject);
}