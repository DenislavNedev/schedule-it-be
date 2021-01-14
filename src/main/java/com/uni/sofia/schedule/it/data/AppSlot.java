package com.uni.sofia.schedule.it.data;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DynamicUpdate
public class AppSlot {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", unique = true, nullable = false)
    private String date;

    @Column(name = "start_hour", nullable = false)
    private String startHour;

    @Column(name = "end_hour", nullable = false)
    private String endHour;

    @Column(name = "period", nullable = false)
    private int period;

    @Column(name = "delay", nullable = false)
    private Integer delay;

    public AppSlot() {
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getStartHour() { return startHour; }
    public void setStartHour(String startHour) { this.startHour = startHour; }

    public String getEndHour() { return endHour; }
    public void setEndHour(String endHour) { this.endHour = endHour; }

    public int getPeriod() { return period; }
    public void setPeriod(int period) { this.period = period; }

    public Integer getDelay() { return delay; }
    public void setDelay(Integer delay) { this.delay = delay; }
}
