package cn.lyf1433223.pojo.aviation;

public class Select {
    //航空公司基础数据
    private F_aircompanyt_basic_data f_aircompanyt_basic_data;

    //飞机信息基础数据
    private F_aircraft_basic_data  f_aircraft_basic_data ;

    //机场基础数据
    private F_airport_basic_data f_airport_basic_data;

    //安检通道数据
    private F_channel_basic_data f_channel_basic_data;

    //值机柜台基础数据
    private F_checkin_basic_data f_checkin_basic_data;

    //登机口基础数据
    private F_gate_basic_data f_gate_basic_data;

    //旅客信息表
    private F_passenger f_passenger;

    //旅客航班流水信息表
    private F_passenger_info f_passenger_info;

    //异常原因基础数据
    private F_reason_basic_data f_reason_basic_data;

    //廊桥基础数据
    private F_rec_basic_data f_rec_basic_data;

    // 跑道基础数据
    private F_runway_basic_data f_runway_basic_data;

    //机位基础数据
    private F_seat_basic_data f_seat_basic_data;

    //航班任务基础数据
    private F_task_basic_data f_task_basic_data;

    //航站楼基础数据
     private F_terminal_basic_data f_terminal_basic_data;

    //行李转盘基础数据
    private F_turntable_basic_data f_turntable_basic_data;

    public F_aircompanyt_basic_data getF_aircompanyt_basic_data() {
        return f_aircompanyt_basic_data;
    }

    public void setF_aircompanyt_basic_data(F_aircompanyt_basic_data f_aircompanyt_basic_data) {
        this.f_aircompanyt_basic_data = f_aircompanyt_basic_data;
    }

    public F_aircraft_basic_data getF_aircraft_basic_data() {
        return f_aircraft_basic_data;
    }

    public void setF_aircraft_basic_data(F_aircraft_basic_data f_aircraft_basic_data) {
        this.f_aircraft_basic_data = f_aircraft_basic_data;
    }

    public F_airport_basic_data getF_airport_basic_data() {
        return f_airport_basic_data;
    }

    public void setF_airport_basic_data(F_airport_basic_data f_airport_basic_data) {
        this.f_airport_basic_data = f_airport_basic_data;
    }

    public F_channel_basic_data getF_channel_basic_data() {
        return f_channel_basic_data;
    }

    public void setF_channel_basic_data(F_channel_basic_data f_channel_basic_data) {
        this.f_channel_basic_data = f_channel_basic_data;
    }

    public F_checkin_basic_data getF_checkin_basic_data() {
        return f_checkin_basic_data;
    }

    public void setF_checkin_basic_data(F_checkin_basic_data f_checkin_basic_data) {
        this.f_checkin_basic_data = f_checkin_basic_data;
    }

    public F_gate_basic_data getF_gate_basic_data() {
        return f_gate_basic_data;
    }

    public void setF_gate_basic_data(F_gate_basic_data f_gate_basic_data) {
        this.f_gate_basic_data = f_gate_basic_data;
    }

    public F_passenger getF_passenger() {
        return f_passenger;
    }

    public void setF_passenger(F_passenger f_passenger) {
        this.f_passenger = f_passenger;
    }

    public F_passenger_info getF_passenger_info() {
        return f_passenger_info;
    }

    public void setF_passenger_info(F_passenger_info f_passenger_info) {
        this.f_passenger_info = f_passenger_info;
    }

    public F_reason_basic_data getF_reason_basic_data() {
        return f_reason_basic_data;
    }

    public void setF_reason_basic_data(F_reason_basic_data f_reason_basic_data) {
        this.f_reason_basic_data = f_reason_basic_data;
    }

    public F_rec_basic_data getF_rec_basic_data() {
        return f_rec_basic_data;
    }

    public void setF_rec_basic_data(F_rec_basic_data f_rec_basic_data) {
        this.f_rec_basic_data = f_rec_basic_data;
    }

    public F_runway_basic_data getF_runway_basic_data() {
        return f_runway_basic_data;
    }

    public void setF_runway_basic_data(F_runway_basic_data f_runway_basic_data) {
        this.f_runway_basic_data = f_runway_basic_data;
    }

    public F_seat_basic_data getF_seat_basic_data() {
        return f_seat_basic_data;
    }

    public void setF_seat_basic_data(F_seat_basic_data f_seat_basic_data) {
        this.f_seat_basic_data = f_seat_basic_data;
    }

    public F_task_basic_data getF_task_basic_data() {
        return f_task_basic_data;
    }

    public void setF_task_basic_data(F_task_basic_data f_task_basic_data) {
        this.f_task_basic_data = f_task_basic_data;
    }

    public F_terminal_basic_data getF_terminal_basic_data() {
        return f_terminal_basic_data;
    }

    public void setF_terminal_basic_data(F_terminal_basic_data f_terminal_basic_data) {
        this.f_terminal_basic_data = f_terminal_basic_data;
    }

    public F_turntable_basic_data getF_turntable_basic_data() {
        return f_turntable_basic_data;
    }

    public void setF_turntable_basic_data(F_turntable_basic_data f_turntable_basic_data) {
        this.f_turntable_basic_data = f_turntable_basic_data;
    }

    @Override
    public String toString() {
        return "Select{" +
                "f_aircompanyt_basic_data=" + f_aircompanyt_basic_data +
                ", f_aircraft_basic_data=" + f_aircraft_basic_data +
                ", f_airport_basic_data=" + f_airport_basic_data +
                ", f_channel_basic_data=" + f_channel_basic_data +
                ", f_checkin_basic_data=" + f_checkin_basic_data +
                ", f_gate_basic_data=" + f_gate_basic_data +
                ", f_passenger=" + f_passenger +
                ", f_passenger_info=" + f_passenger_info +
                ", f_reason_basic_data=" + f_reason_basic_data +
                ", f_rec_basic_data=" + f_rec_basic_data +
                ", f_runway_basic_data=" + f_runway_basic_data +
                ", f_seat_basic_data=" + f_seat_basic_data +
                ", f_task_basic_data=" + f_task_basic_data +
                ", f_terminal_basic_data=" + f_terminal_basic_data +
                ", f_turntable_basic_data=" + f_turntable_basic_data +
                '}';
    }
}
