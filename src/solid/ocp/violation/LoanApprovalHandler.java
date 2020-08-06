package solid.ocp.violation;
//Мы вынуждены хардкодить тип аргумента
public class LoanApprovalHandler {

    public void approvePersonLoan(PersonalLoanValidator validator) {
        if (validator.isValid()) {
            //Process of loan
        }
    }

    public void approveVehicleLoan(VehicleLoanValidator validator) {
        if (validator.isValid()) {
            //Process of loan
        }
    }
}
