package org.zuxin.common.util;

import java.io.Serializable;
import java.util.List;

/**
 * �ӿڷ��ؽ����װ
 *
 * @param <T>
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 6357025524092641409L;

    /**
     * ���ݽ��
     */
    List<T> resultList;

    /**
     * �����ݽ��
     */
    private T data;

    /**
     * ����״̬
     */
    ResultCode resultCode = ResultCode.SYSTEM_ERROR;

    /**
     * ��ѯ�������
     */
    int totalSize;

    /**
     * ����ɹ����캯��
     *
     * @param list ��ѯ���
     */
    protected Result(List<T> list) {
        this.resultList = list;
        resultCode = ResultCode.SUCCESS;
    }

    /**
     * ����ɹ����캯��
     *
     * @param data �����ݽ��
     */
    protected Result(T data) {
        this.data = data;
        resultCode = ResultCode.SUCCESS;
    }

    /**
     * ��ҳ����ɹ��������
     *
     * @param list      ��ѯ���
     * @param totalSize ��������
     */
    protected Result(List<T> list, int totalSize) {
        this.resultList = list;
        this.totalSize = totalSize;
        resultCode = ResultCode.SUCCESS;
    }

    /**
     * ����ʧ�ܹ�����
     *
     * @param code ʧ��״̬
     */
    private Result(ResultCode code) {
        this.resultCode = code;
    }

    /**
     * ��ѯ�Ƿ�ɹ�
     *
     * @return �ɹ����
     */
    public boolean isSuccess() {
        return resultCode == ResultCode.SUCCESS;
    }

    /**
     * ��ȡ��ѯ���
     *
     * @return ��ѯ����б�
     */
    public List<T> getResultList() {
        return resultList;
    }

    /**
     * ��ȡ��ѯ״̬��
     *
     * @return ��ѯ״̬��
     */
    public ResultCode getResultCode() {
        return resultCode;
    }

    /**
     * ��ȡ�������
     *
     * @return ��������
     */
    public int getTotalSize() {
        return totalSize;
    }

    /**
     * �ɹ��������
     *
     * @param resultList ��ѯ���
     * @param <E>        �������ݽṹ
     * @return ͨ�ý��
     */
    public static <E> Result<E> buildSuccessResult(List<E> resultList) {
        return new Result<E>(resultList);
    }

    /**
     * �ɹ��������,��ҳ���
     *
     * @param resultList ��ѯ���
     * @param totalSize  ��������
     * @param <E>        ��������
     * @return �����װ
     */
    public static <E> Result<E> buildSuccessResult(List<E> resultList, int totalSize) {
        return new Result<E>(resultList, totalSize);
    }

    /**
     * ʧ�ܽ������
     *
     * @param resultCode ״̬��
     * @param <E>        �������ݽṹ
     * @return ͨ�ý��
     */
    public static <E> Result<E> buildFailResult(ResultCode resultCode) {
        return new Result<E>(resultCode);
    }

    /**
     * �ɹ��������
     *
     * @param data �����ݽ��
     * @param <E>  �������ݽṹ
     * @return ͨ�ý��
     */
    public static <E> Result<E> buildSuccessResult(E data) {
        return new Result<E>(data);
    }

    /**
     * ���������
     *
     */
    public enum ResultCode {

        SUCCESS("SUCCESS", "�ɹ�"),
        SYSTEM_ERROR("SYSTEM_ERROR", "ϵͳ�쳣");

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
