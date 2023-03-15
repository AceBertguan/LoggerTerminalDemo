package org.logger.strategies.storage;

import org.logger.service.MongoService;
import org.logger.strategies.anno.ConditionalOnMongoDbStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author TBH anglebanghua@gmail.com
 * Date: [2023/3/14 4:53]
 * Description: MongoDbStorage Strategy
 */
@Component
@Primary
@ConditionalOnMongoDbStorage
@Qualifier("mongoDbStorageStrategy")
public class MongoDbStorageStrategy<T> implements StorageStrategy<T> {
    private final MongoService mongoService;

    @Autowired
    public MongoDbStorageStrategy(MongoService mongoService) {
        this.mongoService = mongoService;
    }

    /**
     * 批量添加
     *
     * @param dataList 数据列表
     */
    @Override
    public void saveMany(List<T> dataList) {
        mongoService.saveBatch(dataList);
    }

    /**
     * 新增数据
     *
     * @param object 数据对象
     */
    @Override
    public void create(T object) {
    }

    /**
     * 查询数据
     *
     * @param id 主键信息
     * @return 查询返回
     */
    @Override
    public T read(String id) {
        return null;
    }

    /**
     * 更新数据
     *
     * @param id     主键信息
     * @param object 更新对象
     */
    @Override
    public void update(String id, T object) {

    }

    /**
     * 删除数据
     *
     * @param id 主键信息
     */
    @Override
    public void delete(String id) {

    }

    /**
     * 软删除
     *
     * @param id 主键信息
     */
    @Override
    public void deleteSoft(String id) {

    }
}