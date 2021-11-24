package com.user.view;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

	import com.user.model.Address;
	import com.user.service.AddressService;

	@RestController
	public class AddressController {
		@Autowired
		AddressService AddressService;

		@RequestMapping({ "/", "/address" })
		public List<Address> getAddressData() {
			return AddressService.getAddressData();
		}

		@GetMapping("/address/{id}")
		public String deleteAddress(@PathVariable("id") String addressId) {
			return AddressService.deleteAddress(addressId);
		}

		@PostMapping({ "/", "/address" })
		public String addAddress(@RequestParam String userId, @RequestParam String permanentaddress, @RequestParam String temporaryaddress, @RequestParam String officeaddress){
			return AddressService.addAddress(userId, permanentaddress, temporaryaddress, officeaddress);
	}
	}