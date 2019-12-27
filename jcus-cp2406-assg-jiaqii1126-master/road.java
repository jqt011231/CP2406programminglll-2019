public class Road {

    String name;
    int route_distance;
    Car vehicle;

    trafficLight =  traffic_light;
    Road =  road_between;

    Object [] pavement;

    boolean traffic_meet = false;

    public Road (String name, in route_distance, Car vehicle, trafficLight trafficlight, road_between) {

        this.name=name;
        this.route_distance =route_distance;
        this.vehicle=vehicle;

        this.traffic_light =trafficlight;
        this.road_between = road_between;

        this.pavement =new Object[route_distance];
        pavement[0]=vehicle;
        pavement[this.route_distance -1]=trafficlight;
    }

    public void position_info(Car vehicle) {

        if(vehicle.position<this.route_distance) {

            this.pavement[vehicle.position] = this.vehicle;
        }
        else if(vehicle.position==this.route_distance){

            if(traffic_light.color.equalsIgnoreCase("Green")) {

                vehicle.position = 0;
                vehicle.current_park_car = road_between;
                traffic_meet = true;
            }

            else {

                vehicle.position -= 1;
            }
        }
    }
}
