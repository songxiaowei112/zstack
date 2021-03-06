package org.zstack.header.network.l3

import java.lang.Boolean
import java.sql.Timestamp
import java.sql.Timestamp
import org.zstack.header.network.l3.IpRangeInventory
import org.zstack.header.network.service.NetworkServiceL3NetworkRefInventory

doc {

	title "在这里输入结构的名称"

	field {
		name "uuid"
		desc "资源的UUID，唯一标示该资源"
		type "String"
		since "0.6"
	}
	field {
		name "name"
		desc "资源名称"
		type "String"
		since "0.6"
	}
	field {
		name "description"
		desc "资源的详细描述"
		type "String"
		since "0.6"
	}
	field {
		name "type"
		desc ""
		type "String"
		since "0.6"
	}
	field {
		name "zoneUuid"
		desc "区域UUID"
		type "String"
		since "0.6"
	}
	field {
		name "l2NetworkUuid"
		desc "二层网络UUID"
		type "String"
		since "0.6"
	}
	field {
		name "state"
		desc ""
		type "String"
		since "0.6"
	}
	field {
		name "dnsDomain"
		desc ""
		type "String"
		since "0.6"
	}
	field {
		name "system"
		desc ""
		type "Boolean"
		since "0.6"
	}
	field {
		name "category"
		desc ""
		type "String"
		since "0.6"
	}
	field {
		name "createDate"
		desc "创建时间"
		type "Timestamp"
		since "0.6"
	}
	field {
		name "lastOpDate"
		desc "最后一次修改时间"
		type "Timestamp"
		since "0.6"
	}
	field {
		name "dns"
		desc ""
		type "List"
		since "0.6"
	}
	ref {
		name "ipRanges"
		path "org.zstack.header.network.l3.L3NetworkInventory.ipRanges"
		desc "null"
		type "List"
		since "0.6"
		clz IpRangeInventory.class
	}
	ref {
		name "networkServices"
		path "org.zstack.header.network.l3.L3NetworkInventory.networkServices"
		desc "null"
		type "List"
		since "0.6"
		clz NetworkServiceL3NetworkRefInventory.class
	}
}
