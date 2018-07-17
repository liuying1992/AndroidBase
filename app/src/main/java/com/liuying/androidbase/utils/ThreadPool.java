package com.liuying.androidbase.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPool {
  private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
  private static final Executor THREAD_POOL =
      new ThreadPoolExecutor(CPU_COUNT, CPU_COUNT * 4, 10, TimeUnit.SECONDS,
          new LinkedBlockingQueue(CPU_COUNT * 8), new ThreadPoolFactory(),
          new DiscardOldestPolicy());
  private static ThreadPool sThreadPool = new ThreadPool();

  public static ThreadPool getInstance() {
    return sThreadPool;
  }

  public Executor getExecutor() {
    return THREAD_POOL;
  }

  public void execute(Runnable r) {
    THREAD_POOL.execute(r);
  }

  public void execute(FutureTask futureTask) {
    THREAD_POOL.execute(futureTask);
  }

  public void cancel(FutureTask futureTask) {
    futureTask.cancel(true);
  }

  private static class ThreadPoolFactory implements ThreadFactory {
    private final AtomicInteger mCount = new AtomicInteger(1);

    ThreadPoolFactory() {
    }

    @Override public Thread newThread(Runnable r) {
      Thread thread = new Thread(r, "THREAD_POOL#" + this.mCount.getAndIncrement());
      thread.setPriority(1);
      return thread;
    }
  }
}