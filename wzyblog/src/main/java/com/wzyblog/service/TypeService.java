package com.wzyblog.service;/*
 *@Auther: wzy
 *@Date:2021/11/1 -11-01
 *@Descreption: com.wzyblog.service
 *@Version: 1.0
 */

import com.wzyblog.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.naming.Name;
import java.util.Optional;

public interface TypeService {

    Type saveType(Type type);
//    增
    void deleteType(Long id);
//    删
    Type updateType(Long id,Type type);
//    改
    Page<Type> listType(Pageable pageable);
//    查多条
    Type getType(Long id);
//    查一条
    Type getTypeByName(String name);
}
