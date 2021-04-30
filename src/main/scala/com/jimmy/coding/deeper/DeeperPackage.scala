package com.jimmy.coding.deeper

import org.slf4j.LoggerFactory

class DeeperPackage {
  val logger = LoggerFactory.getLogger(this.getClass.getPackageName)

  def logFromDeeperPackage: Unit =
    logger.info("Logging from a deeper place")
    logger.debug("Won't show.")
}
