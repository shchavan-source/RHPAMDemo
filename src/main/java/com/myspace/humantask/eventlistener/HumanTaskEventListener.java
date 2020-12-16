package com.myspace.humantask.eventlistener;

import org.kie.api.task.TaskEvent;
import org.kie.api.task.TaskLifeCycleEventListener;

public class HumanTaskEventListener implements TaskLifeCycleEventListener {

    public void beforeTaskActivatedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskActivatedEvent: " + taskEvent.getTask().getDescription());
    }

    public void beforeTaskClaimedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskClaimedEvent: " + taskEvent.getTask().getDescription());
    }

    public void beforeTaskSkippedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskSkippedEvent: " + taskEvent.getTask().getDescription());
    }

    public void beforeTaskStartedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskStartedEvent: " + taskEvent.getTask().getDescription());
    }

    public void beforeTaskStoppedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskStoppedEvent: " + taskEvent.getTask().getDescription());
    }

    public void beforeTaskCompletedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskCompletedEvent: " + taskEvent.getTask().getDescription());
    }

    public void beforeTaskFailedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskFailedEvent: " + taskEvent.getTask().getDescription());
    }

    public void beforeTaskAddedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskAddedEvent: " + taskEvent.getTask().getDescription());
    }

    public void beforeTaskExitedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskExitedEvent: " + taskEvent.getTask().getDescription());
    }

    public void beforeTaskReleasedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskReleasedEvent: " + taskEvent.getTask().getDescription());
    }

    public void beforeTaskResumedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskResumedEvent: " + taskEvent.getTask().getDescription());
    }

    public void beforeTaskSuspendedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskSuspendedEvent: " + taskEvent.getTask().getDescription());
    }

    public void beforeTaskForwardedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskForwardedEvent: " + taskEvent.getTask().getDescription());
    }

    public void beforeTaskDelegatedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskDelegatedEvent: " + taskEvent.getTask().getDescription());
    }

    public void beforeTaskNominatedEvent(TaskEvent taskEvent) {
        System.out.println("beforeTaskNominatedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskActivatedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskActivatedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskClaimedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskClaimedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskSkippedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskSkippedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskStartedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskStartedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskStoppedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskStoppedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskCompletedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskCompletedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskFailedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskFailedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskAddedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskAddedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskExitedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskExitedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskReleasedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskReleasedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskResumedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskResumedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskSuspendedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskSuspendedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskForwardedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskForwardedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskDelegatedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskDelegatedEvent: " + taskEvent.getTask().getDescription());
    }

    public void afterTaskNominatedEvent(TaskEvent taskEvent) {
        System.out.println("afterTaskNominatedEvent: " + taskEvent.getTask().getDescription());
    }
}