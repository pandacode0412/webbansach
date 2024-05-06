package com.web.webbansach.dao;

import com.web.webbansach.entity.HinhThucThanhToan;
import com.web.webbansach.entity.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "nguoi-dung")
public interface NguoiDungRepository extends JpaRepository<NguoiDung, Integer> {
}
