package cn.am.bean;

public class AlexJSONResult {

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;
    
    private String ok;	// 不使用

    public static AlexJSONResult build(Integer status, String msg, Object data) {
        return new AlexJSONResult(status, msg, data);
    }

    public static AlexJSONResult ok(Object data) {
        return new AlexJSONResult(data);
    }

    public static AlexJSONResult ok() {
        return new AlexJSONResult(null);
    }
    
    public static AlexJSONResult errorMsg(String msg) {
        return new AlexJSONResult(500, msg, null);
    }
    
    public static AlexJSONResult errorMap(Object data) {
        return new AlexJSONResult(501, "error", data);
    }
    
    public static AlexJSONResult errorTokenMsg(String msg) {
        return new AlexJSONResult(502, msg, null);
    }
    
    public static AlexJSONResult errorException(String msg) {
        return new AlexJSONResult(555, msg, null);
    }

    public AlexJSONResult() {

    }

    public AlexJSONResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public AlexJSONResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}

}
