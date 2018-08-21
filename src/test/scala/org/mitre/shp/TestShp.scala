package org.mitre.shp

import org.junit.AfterClass
import org.junit.Test

import org.apache.daffodil.tdml.Runner

object TestShp {
  lazy val runner = Runner("/org/mitre/shp/", "TestShp.tdml")

  @AfterClass def shutDown {
    runner.reset
  }
}

class TestShp {

  import TestShp._

  @Test def test_ne_110m_admin_0_countries() = { runner.runOneTest("test_ne_110m_admin_0_countries") }
  @Test def test_ne_110m_admin_1_states_provinces() = { runner.runOneTest("test_ne_110m_admin_1_states_provinces") }
  @Test def test_ne_10m_airports() = { runner.runOneTest("test_ne_10m_airports") }
  @Test def test_ne_10m_time_zones() = { runner.runOneTest("test_ne_10m_time_zones") }
}
