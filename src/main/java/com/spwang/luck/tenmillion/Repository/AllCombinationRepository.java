package com.spwang.luck.tenmillion.Repository;

import com.spwang.luck.tenmillion.entity.AllCombination;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author spwang 2019/7/20 1:16 PM
 * @version 0.0.1
 * @since 0.0.1
 */
@Mapper
public interface AllCombinationRepository {
    Long count();

    Long save(AllCombination allCombination);

    Long saveAll(List<AllCombination> list);

    List<AllCombination> selectAllById(@Param("id") Long id);

    int insertList(@Param("list")List<AllCombination> list);
}
