import java.util.TimeZone.getAvailableIDs

//getAvailableIDs().map(a=>a.split("/")).filter(_.length>1).map(a=>println(a(1)))

getAvailableIDs().map(a=>a.split("/")).filter(_.length>1).grouped(10).toArray.map(a=>println(a(0).toString))

// Map function iterates over the array and splits any that have a /, creating some