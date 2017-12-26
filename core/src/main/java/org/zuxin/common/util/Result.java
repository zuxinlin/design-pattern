package org.zuxin.common.util;

import java.io.Serializable;
import java.util.List;

/**
 * 接口返回结果封装
 *
 * @param <T>
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 6357025524092641409L;

    /**
     * 数据结果
     */
    List<T> resultList;

    /**
     * 单数据结果
     */
    private T data;

    /**
     * 数据状态
     */
    ResultCode resultCode = ResultCode.SYSTEM_ERROR;

    /**
     * 查询结果总量
     */
    int totalSize;

    /**
     * 请求成功构造函数
     *
     * @param list 查询结果
     */
    protected Result(List<T> list) {
        this.resultList = list;
        resultCode = ResultCode.SUCCESS;
    }

    /**
     * 请求成功构造函数
     *
     * @param data 单数据结果
     */
    protected Result(T data) {
        this.data = data;
        resultCode = ResultCode.SUCCESS;
    }

    /**
     * 分页请求成功结果构造
     *
     * @param list      查询结果
     * @param totalSize 数据总量
     */
    protected Result(List<T> list, int totalSize) {
        this.resultList = list;
        this.totalSize = totalSize;
        resultCode = ResultCode.SUCCESS;
    }

    /**
     * 请求失败构造器
     *
     * @param code 失败状态
     */
    private Result(ResultCode code) {
        this.resultCode = code;
    }

    /**
     * 查询是否成功
     *
     * @return 成功与否
     */
    public boolean isSuccess() {
        return resultCode == ResultCode.SUCCESS;
    }

    /**
     * 获取查询结果
     *
     * @return 查询结果列表
     */
    public List<T> getResultList() {
        return resultList;
    }

    /**
     * 获取查询状态码
     *
     * @return 查询状态码
     */
    public ResultCode getResultCode() {
        return resultCode;
    }

    /**
     * 获取结果总量
     *
     * @return 数据总量
     */
    public int getTotalSize() {
        return totalSize;
    }

    /**
     * 成功结果构造
     *
     * @param resultList 查询结果
     * @param <E>        泛型数据结构
     * @return 通用结果
     */
    public static <E> Result<E> buildSuccessResult(List<E> resultList) {
        return new Result<E>(resultList);
    }

    /**
     * 成功结果构造,分页结果
     *
     * @param resultList 查询结果
     * @param totalSize  数据总量
     * @param <E>        数据类型
     * @return 结果封装
     */
    public static <E> Result<E> buildSuccessResult(List<E> resultList, int totalSize) {
        return new Result<E>(resultList, totalSize);
    }

    /**
     * 失败结果构造
     *
     * @param resultCode 状态码
     * @param <E>        泛型数据结构
     * @return 通用结果
     */
    public static <E> Result<E> buildFailResult(ResultCode resultCode) {
        return new Result<E>(resultCode);
    }

    /**
     * 成功结果构造
     *
     * @param data 单数据结果
     * @param <E>  泛型数据结构
     * @return 通用结果
     */
    public static <E> Result<E> buildSuccessResult(E data) {
        return new Result<E>(data);
    }

    /**
     * 结果返回码
     *
     */
    public enum ResultCode {

        SUCCESS("SUCCESS", "成功"),
        SYSTEM_ERROR("SYSTEM_ERROR", "系统异常");

        String errorCode;
        String desc;

        ResultCode(String errorCode, String desc) {
            this.errorCode = errorCode;
            this.desc = desc;
        }

        public String getErrorCode() {
            return errorCode;
        }

        public String getDesc() {
            return desc;
        }
    }

    public T getData() {
        return data;
    }

    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
}
