package ru.beeline.parsebinarysig.data;

import lombok.Builder;
import lombok.Data;

/**
 * Author: Aleksey Chershembeev
 * created : 20.09.2021 - 16:35
 * description:
 */


@Data
@Builder
public class SourceDataSig {


    private int eventId;
    private int eventLength;
    private int eNodeBId;
    private int cellId;
    private int callId;
    //null
    private int dateTime;
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;
    private int milliseconds;
    private int extendHeadLength;
    private int ItemType;
    //00
    private int reserved;
    private int CRNTI;
    private int messageDirection;
    private int messageLength;
    private int messageContent;



}
