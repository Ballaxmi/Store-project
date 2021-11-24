package com.user.service.impl;


	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.user.model.Address;
	import com.user.repo.AddressRepository;
	import com.user.service.AddressService;

	@Service
	public class AddressServiceImpl implements AddressService {
		@Autowired
		AddressRepository addressrepo;

		@Override
		public List<Address> getAddressData() {
			return addressrepo.findAll();

		}

		@Override
		public String deleteAddress(String userId) {
			Optional<Address> adr = addressrepo.findById(userId);
			if (adr.isPresent()) {
				addressrepo.delete(adr.get());
			}
			return "Data Deleted Successfully...";

		}

		public String addAddress(String userId, String permanentaddress, String temporaryaddress, String officeaddress) {

			com.user.model.Address address = new Address();
			address.setUserId(userId);
			address.setPermanentaddress(permanentaddress);
			address.setTemporaryaddress(temporaryaddress);
			address.setOfficeaddress(officeaddress);
			addressrepo.save(address);

			return "Data added SuccessFully..";
		}

	

}