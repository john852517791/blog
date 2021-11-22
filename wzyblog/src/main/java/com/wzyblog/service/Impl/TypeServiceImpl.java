package com.wzyblog.service.Impl;/*
 *@Auther: wzy
 *@Date:2021/11/1 -11-01
 *@Descreption: com.wzyblog.service.Impl
 *@Version: 1.0
 */

import com.wzyblog.Exception.BlogNotFoundException;
import com.wzyblog.dao.TypeRepository;
import com.wzyblog.entity.Type;
import com.wzyblog.service.TypeService;
import javassist.NotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeRepository typeRepository;


    @Transactional
    @Override
    public Type saveType(Type type) {
        return typeRepository.save(type);
    }
    @Transactional
    @Override
    public void deleteType(Long id) {
        typeRepository.deleteById(id);
    }
    @Transactional
    @Override
    public Type updateType(Long id, Type type) {
        Type t=typeRepository.getById(id);
        if (t==null){
            throw new BlogNotFoundException("不存在该类型");
        }
        BeanUtils.copyProperties(type,t);
//        将type中的值赋到t对象中【不明白这一步的意义是什么】
        return typeRepository.save(t);
    }
    @Transactional
    @Override
    public Page<Type> listType(Pageable pageable) {
        return typeRepository.findAll(pageable);
    }
    @Transactional
    @Override
    public Type getType(Long id) {
        return typeRepository.getById(id);
    }

    @Override
    public Type getTypeByName(String name) {
        return typeRepository.findByName(name);
    }
}
