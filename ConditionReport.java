import java.util.Date;

class ConditionReport {
    String reportId;
    String vehicleId;
    String beforePhoto;
    String afterPhoto;
    Date reportDate;
    String damageStatus;

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
        System.out.println("Condition Report " + reportId + " finalized with damage status: " + damageStatus);
    }

    public void updateDamageStatus(String newStatus) {
        this.damageStatus = newStatus;
        System.out.println("Damage status for report " + reportId + " updated to: " + damageStatus);
    }

    public void displayReport() {
        System.out.println("Condition Report ID: " + reportId +
                           ", Vehicle ID: " + vehicleId +
                           ", Before Photo: " + beforePhoto +
                           ", After Photo: " + afterPhoto +
                           ", Report Date: " + reportDate +
                           ", Damage Status: " + damageStatus);
    }
}
