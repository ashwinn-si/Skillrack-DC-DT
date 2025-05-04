/*
The program must accept the start time and end time representing the visiting slot of a doctor. Then the program
accepts N appointment requests from N patients. The doctor consultation duration of each patient is 30 minutes. For
each request, the program must validate the request and print the output based on the following conditions.
- If there are no appointments scheduled in the given slot, then the appointment must be scheduled and the program
must print "Appointment Scheduled Successfully" as the output.
- Else the program must print "Failed" as the output.
Your task is to define the class Doctor so that the program runs successfully.
Note: The time will be in 24-hr format HH:MM.

Input:
10:00 13:30
11
10:00
10:15
09:45
13:40
10:30
11:01
11:30
11:31
13:02
12:58
13:29

Output:
10:00 Appointment Scheduled Successfully
10:15 Failed
09:45 Failed
13:40 Failed
10:30 Appointment Scheduled Successfully
11:01 Appointment Scheduled Successfully
11:30 Failed
11:31 Appointment Scheduled Successfully
13:02 Failed
12:58 Appointment Scheduled Successfully
13:29 Failed
 */

class Doctor {
    int stTime = 0, endTime = 0;
    HashSet <Integer> hash;
    Doctor(String stTime, String endTime){
        String stParts[] = stTime.split(":");
        String endParts[] = endTime.split(":");
        this.stTime = Integer.parseInt(stParts[0]) * 60  + Integer.parseInt(stParts[1]);
        this.endTime = Integer.parseInt(endParts[0]) * 60 + Integer.parseInt(endParts[1]);
        hash = new HashSet<>();
    }
    
    boolean bookAppointment(String requestedTime){
        String timeParts[] = requestedTime.split(":");
        int timeInMins = Integer.parseInt(timeParts[0]) * 60 + Integer.parseInt(timeParts[1]);
        if(timeInMins < stTime || timeInMins > endTime || timeInMins + 30 > endTime){
            return false;
        }
        boolean flag = true;
        for(int time : hash){
            // this appoint time slot is time -> time + 30
            if( (timeInMins > time && timeInMins < time + 30) || (timeInMins + 30 > time) && timeInMins + 30 < time + 30 ){
                return false;
            }
        }
        hash.add(timeInMins);
        return true;
    }
    
} 