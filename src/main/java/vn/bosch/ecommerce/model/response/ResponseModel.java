package vn.bosch.ecommerce.model.response;

public class ResponseModel {
    private String status;
    private Object payload;
    public ResponseModel(String status, Object payload){
        this.status = status;
        this.setPayload(payload);
    }
    public ResponseModel (){

    }
    public Object getPayload() {
        return this.payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(Object payload) {
        this.status = status;
    }
}
