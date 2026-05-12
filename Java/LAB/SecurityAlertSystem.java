public class SecurityAlertSystem {
        String alertId;
        String threatType;
        int severityLevel;

        SecurityAlertSystem(String alertId, String threatType, int severityLevel){
        this.alertId = alertId;
        this.threatType = threatType;
        this.severityLevel = severityLevel;
        }
        void displayAlert(){
            System.out.println("Alert ID: " + alertId);
            System.out.println("Threat Type: " + threatType);
            System.out.println("Severity Level: " + severityLevel);
        }

        public static void main(String[] args){
                SecurityAlertSystem alert1 = new SecurityAlertSystem("ALERT001", "Unauthorized Access", 5);
                SecurityAlertSystem alert2 = new SecurityAlertSystem("ALERT002","Terrorism",10);

            System.out.println("Security Alert 1:");
            alert1.displayAlert();
            System.out.println("\nSecurity Alert 2:");
            alert2.displayAlert();

            }

}