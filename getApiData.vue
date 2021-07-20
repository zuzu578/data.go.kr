<template>
  <div>
      <h1> get Data !</h1>
      <table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Handle</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td colspan="2">Larry the Bird</td>
      <td>@twitter</td>
    </tr>
  </tbody>
</table>
     
      <div class="board_view_area" v-for="(jData, idx) in boardData" :key="idx">
          <div class="location">
          시도 명 : {{jData.ctprvnNm}}
          </div>
          <div class="rstde">
              허가 구역 휴일 : {{jData.rstde}}
              </div>
            <div class="weekdayOperOpenHhmm">
                허가 구역 평일 운영 시작 시간 : {{jData.weekdayOperOpenHhmm}}
            </div>
            <div class="weekdayOperColseHhmm">
                허가 구역 평일 운영 종료 시간 :{{jData.weekdayOperColseHhmm}}
                </div>
            <div class="wkendOperOpenHhmm">
                주말 운영 시작 시간 : {{jData.wkendOperOpenHhmm}}
            </div>
            <div class="wkendOperCloseHhmm">
                주말 운영 종료 시간 : {{jData.wkendOperCloseHhmm}}
            </div>
            <div class="lmttPrdlst">
                판매 제한 품목 :{{jData.lmttPrdlst}}
            </div>
            <div class="phoneNumber">
                기관 전화번호 :{{jData.phoneNumber}}
                </div>
            
          <div class="latitude">
              위도: {{jData.latitude}}
              </div>
           <div class="longitude">
              경도: {{jData.longitude}}
              </div>
                 
          <div class="address">
              소재지 도로명 주소 : {{jData.rdnmadr}}
          </div>
          <div class="storeName">
              허가 구역명 :{{jData.prmisnZoneNm}}
          </div>
          <div class="referenceDate">
              데이터 기준 일자 :{{jData.referenceDate}}
        </div>
      </div>
     
     
   
  </div>
</template>

<script>
import axios from 'axios'
export default {
    data(){
        return{
            boardData:'',
        }

    }
    ,created(){
        axios.get('http://api.data.go.kr/openapi/tn_pubr_public_food_truck_permit_area_api?serviceKey=pIjdyg6yRnPqmwfTfG4m3TIDh518lq4lqoOgjavC5e1QPr3Vut5Dri2mQXpGfX5CbeusLqm9VNvju4fmvIkv0g%3D%3D&pageNo=0&numOfRows=100&type=json')

    .then((res)=>{
        //if success! //
        console.log(res);
        console.log(res.data.response.body.items);
        //this.boardData = res.data;
       // console.log(this.boardData);
       this.boardData = res.data.response.body.items;
    })
    },
    mounted(){

    },
    methods:{

    },

}
</script>

<style>
@import 'https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css'
</style>