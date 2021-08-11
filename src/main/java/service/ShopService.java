package service;

import creator.DesktopCreator;
import creator.DeviceCreator;
import creator.MobileCreator;
import creator.TabletCreator;
import entries.Device;
import entries.DeviceType;

public class ShopService {
    public ShopService() {
    }

    public void run() {
        createDesktops();
        createMobiles();
        createTablets();
    }

    private void createDesktops() {
        DeviceCreator creator = getDeviceCreator(DeviceType.DESKTOP);
        Device dt1 = creator.createDevice("Dell XYZ123", 123987, 87437, 230, 507, 690);
        System.out.println(dt1);

        try {
            Device dt2 = (Device) dt1.clone();
            System.out.println("Cloned: " + dt2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private void createMobiles() {
        DeviceCreator creator = getDeviceCreator(DeviceType.MOBILE);
        Device mb1 = creator.createDevice("iPhone XXX", 990099, 33211, 85, 8, 176);
        System.out.println(mb1);

        try {
            Device mb2 = (Device) mb1.clone();
            System.out.println("Cloned: " + mb2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private void createTablets() {
        DeviceCreator creator = getDeviceCreator(DeviceType.TABLET);
        Device tb1 = creator.createDevice("Samsung A32", 4433445, 86749, 230, 12, 280);
        System.out.println(tb1);

        try {
            Device tb2 = (Device) tb1.clone();
            System.out.println("Cloned: " + tb2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private DeviceCreator getDeviceCreator(DeviceType type) {
        switch (type) {
            case DESKTOP:
                return new DesktopCreator();
            case MOBILE:
                return new MobileCreator();
            case TABLET:
                return new TabletCreator();
            default:
                throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }
}
