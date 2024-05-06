package com.web.webbansach.dao;

import com.web.webbansach.entity.NguoiDung;
import com.web.webbansach.entity.Quyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "quyen")
public interface QuyenRepository extends JpaRepository<Quyen, Integer> {
}
