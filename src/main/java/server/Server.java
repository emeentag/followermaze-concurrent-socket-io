package server;

import java.net.ServerSocket;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

import server.entity.User;

/**
 * Server
 * Abstract class of the servers.
 */
public abstract class Server {

  private AtomicBoolean inService;
  private ServerSocket serverSocket;
  private ExecutorService pool;
  private ConcurrentHashMap<Long, User> userMap;

  public Server(ConcurrentHashMap<Long, User> userMap, ExecutorService pool, AtomicBoolean inService) {
    this.userMap = userMap;
    this.pool = pool;
    this.inService = inService;
  }

  /**
   * @param inService the inService to set
   */
  public void setInService(AtomicBoolean inService) {
    this.inService = inService;
  }

  /**
   * @return the inService
   */
  public AtomicBoolean getInService() {
    return inService;
  }

  /**
   * @param pool the pool to set
   */
  public void setPool(ExecutorService pool) {
    this.pool = pool;
  }

  /**
   * @return the pool
   */
  public ExecutorService getPool() {
    return pool;
  }

  /**
   * @param userMap the userMap to set
   */
  public void setUserMap(ConcurrentHashMap<Long, User> userMap) {
    this.userMap = userMap;
  }

  /**
   * @return the userMap
   */
  public ConcurrentHashMap<Long, User> getUserMap() {
    return userMap;
  }

  /**
   * @param serverSocket the serverSocket to set
   */
  protected void setServerSocket(ServerSocket serverSocket) {
    this.serverSocket = serverSocket;
  }

  /**
   * @return the serverSocket
   */
  protected ServerSocket getServerSocket() {
    return serverSocket;
  }

}