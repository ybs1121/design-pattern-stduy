package com.example.designpattern.옵저버패턴.subject;

import com.example.designpattern.옵저버패턴.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();


}
