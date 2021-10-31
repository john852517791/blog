package com.wzyblog.dao;/*
 *@Auther: wzy
 *@Date:2021/10/31 -10-31
 *@Descreption: com.wzyblog.dao
 *@Version: 1.0
 */

import com.wzyblog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
//                                          dao要操作的对象——User；此对象实体表的主键类型为long

    User findByUserNameAndPassword(String username,String password);


}
