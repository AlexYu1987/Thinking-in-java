//（胡牌类型+听牌类型+跑20+牌型+花色+门清+无花果 + (硬花+软花)x砸2）x比下胡x自摸x0.5
var calculate=function(options){
	var fan = (Number($("#hupaileixing").val()) + Number($("#tingpaileixing").val()) + 
		Number($("#pao20").val()) + Number($("#paixing").val()) + Number($("#huase").val()) + 
		Number($("#menqing").val()) + Number($("#wuhuaguo").val()) + 
		(Number($("#yinghua").val()) + Number($("#ruanhua").val())) * 2) * Number($("#bixiahu").val())
		 * Number($("#zimo").val()) / 2;

	fan = Math.ceil(fan);
	$("#result").val(fan);
};

var doConstraint=function(option){
	var rules = constraint[option];
	if (!rules) return;
	rules.forEach(function(e){
		$("#" + e.id).val(e.value).attr("disabled","disabled");
	});
};

var constraint={
	"tianhu":[{
		'id':"tingpaileixing",
		"value":0
	},{
		'id':'paixing',
		'value':0
	},{
		'id':'huase',
		'value':0
	},{
		'id':'yinghua',
		'value':0
	},{
		'id':'ruanhua',
		'value':0
	},{
		'id':'menqing',
		'value':0
	},{
		'id':'zimo',
		'value':1
	},{
		'id':'bixiahu',
		'value':1
	},{
		'id':'pao20',
		'value':0
	},{
		'id':'wuhuaguo',
		'value':0
	}],

	"gangkai":[{
		'id':'menqing',
		'value':20
	},{
		'id':'zimo',
		'value':3
	}],

	"huakai":[{
		'id':'zimo',
		'value':3
	}],

	"quanqiu":[{
		'id':'paixing',
		'value':0
	},{
		'id':'menqing',
		'value':0
	}],

	"wuhuaguo":[{
		'id':'yinghua',
		'value':0
	}],

	"qixiaodui":[{
		'id':'menqing',
		'value':20
	}],

	"shuangqidui":[{
		'id':'menqing',
		'value':20
	}]
};
