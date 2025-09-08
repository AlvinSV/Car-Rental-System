import java.util.Date;

public class ConditionReport {
    private String reportId;
    private String vehicleId;
    private String beforePhoto;
    private String afterPhoto;
    private Date reportDate;
    private String damageStatus;

    public ConditionReport(String reportId, String vehicleId, String beforePhoto, Date reportDate) {
        this.reportId = reportId;
        this.vehicleId = vehicleId;
        this.beforePhoto = beforePhoto;
        this.reportDate = reportDate;
        this.damageStatus = "NONE";
        this.afterPhoto = "";
    }

    public void finalizeReport(String afterPhoto, String finalDamageStatus) {
        this.afterPhoto = afterPhoto;
        this.damageStatus = finalDamageStatus;
        this.reportDate = new Date();
    }

    public void updateDamageStatus(String newStatus) {
        this.damageStatus = newStatus;
    }

    public String getReportId() {
        return reportId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getBeforePhoto() {
        return beforePhoto;
    }

    public String getAfterPhoto() {
        return afterPhoto;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public String getDamageStatus() {
        return damageStatus;
    }

    public void setAfterPhoto(String afterPhoto) {
        this.afterPhoto = afterPhoto;
    }
}