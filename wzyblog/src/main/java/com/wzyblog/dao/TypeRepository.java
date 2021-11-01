package com.wzyblog.dao;/*
 *@Auther: wzy
 *@Date:2021/11/1 -11-01
 *@Descreption: com.wzyblog.dao
 *@Version: 1.0
 */

import com.wzyblog.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type,Long> {


}
