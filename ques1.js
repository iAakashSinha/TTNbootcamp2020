function simpleInterest() {

    var amount, rateOfInterest, time;

    //Taking input for Principal Amount
    for (; ;) {

        amount = prompt("Please enter a amount :");

        if (amount == null) {
            // alert("I'm out of here.")
            return;
        } else {
            if (amount.length <= 0 || isNaN(amount)) {
                alert("Invalid input.");
            } else {

                amount = parseInt(amount);
                break;
            }
        }
    }

    //Taking input for Rate of Interest
    for (; ;) {

        rateOfInterest = prompt("Please enter a Rate Of Interest :");

        if (rateOfInterest == null) {
            // alert("I'm out of here.")
            return;
        } else {
            if (rateOfInterest.length <= 0 || isNaN(rateOfInterest)) {
                alert("Invalid input.");
            } else {

                rateOfInterest = parseInt(rateOfInterest);
                break;
            }
        }
    }


    //Taking input for Time
    for (; ;) {

        time = prompt("Please enter a time :");

        if (time == null) {
            // alert("I'm out of here.")
            return;
        } else {
            if (time.length <= 0 || isNaN(time)) {
                alert("Invalid input.");
            } else {

                time = parseInt(time);
                break;
            }
        }
    }

    var simpleInterst = (amount*rateOfInterest*time)/100;

    alert("Your Simple Interst = "+simpleInterst);

}