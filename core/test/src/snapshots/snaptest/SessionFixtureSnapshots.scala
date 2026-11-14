package snapshots.snaptest

// The snapshots of `snaptest.SessionFixture`, written like the generated ones
object SessionFixtureSnapshots extends snaptest.Snapshots:
  def entries = Seq("a" -> "1", "b" -> "2")
